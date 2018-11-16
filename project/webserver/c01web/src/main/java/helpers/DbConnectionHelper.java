package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DbConnectionHelper
{
	private String dbName;
	private String dbUsername;
	private String dbPassword;
	
	private Connection connection;
	
	public DbConnectionHelper()
	{
	}
	
	public void findDatabaseInfo() throws FileNotFoundException, UnsupportedEncodingException
	{
		String s = getClass().getName();
		int i = s.lastIndexOf(".");
		if(i > -1) s = s.substring(i + 1);
		s = s + ".class";
		System.out.println("name " +s);
		String testPath = this.getClass().getResource(s).toString();
		System.out.println(testPath);
		String realpath = URLDecoder.decode(testPath.substring(6), "UTF-8");
		System.out.println(realpath);
		
		Path p = Paths.get(realpath);
		Path folder = p.getParent();
		System.out.println(folder.toString());
		File config = new File(folder.toString() + "\\" + "dbconfig.txt");

		Scanner sc = new Scanner(config);
		this.dbName = sc.nextLine();
		this.dbUsername = sc.nextLine();
		this.dbPassword = sc.nextLine();
		sc.close();
	}
	
	public Connection connect() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/" + this.dbName + "?useSSL=false&allowPublicKeyRetrieval=true";
		//return DriverManager.getConnection(url, this.dbUsername, this.dbPassword);
		if (this.connection == null)
		{
			this.connection = DriverManager.getConnection(url, this.dbUsername, this.dbPassword);
		}
		return this.connection;
	}
	
	public void close()
	{
		this.connection = null;
	}
}
