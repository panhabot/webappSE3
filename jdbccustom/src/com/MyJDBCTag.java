package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyJDBCTag extends TagSupport {
    String driver, url, dbUsername, dbPassword, user, age;

    public void setAge(String age) {
        this.age = age;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAge() {
        return age;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);
            PreparedStatement ps = con.prepareStatement("insert into student value(?,?)");

            ps.setString(1,user);
            ps.setString(2,age);
            ps.execute();
            out.println("Registration Success...");

        }catch (Exception e){

        }
        return super.doStartTag();
    }
}
