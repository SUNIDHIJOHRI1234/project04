/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2023-03-26 18:09:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.Project_4.Controller.UserRegistrationCtl;
import java.util.HashMap;
import in.co.rays.Project_4.Utility.HTMLUtility;
import in.co.rays.Project_4.Utility.ServletUtility;
import in.co.rays.Project_4.Utility.DataUtility;
import in.co.rays.Project_4.Controller.ORSView;
import in.co.rays.Project_4.Bean.UserBean;
import in.co.rays.Project_4.Bean.RoleBean;
import in.co.rays.Project_4.Controller.LoginCtl;
import in.co.rays.Project_4.Controller.ORSView;

public final class UserRegistrationView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1679851784347L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1679850472453L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.Project_4.Utility.HTMLUtility");
    _jspx_imports_classes.add("in.co.rays.Project_4.Bean.UserBean");
    _jspx_imports_classes.add("in.co.rays.Project_4.Controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.Project_4.Bean.RoleBean");
    _jspx_imports_classes.add("in.co.rays.Project_4.Controller.UserRegistrationCtl");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("in.co.rays.Project_4.Utility.DataUtility");
    _jspx_imports_classes.add("in.co.rays.Project_4.Controller.ORSView");
    _jspx_imports_classes.add("in.co.rays.Project_4.Utility.ServletUtility");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\r\n");
      out.write("\thref=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\" />\r\n");
      out.write("<title>User Registration</title>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#udate\").datepicker({\r\n");
      out.write("\t\t\tchangeMonth : true,\r\n");
      out.write("\t\t\tchangeYear : true,\r\n");
      out.write("\t\t\tyearRange : '1980:2010',\r\n");
      out.write("\t\t//  mindefaultDate : \"01-01-1962\"\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	
		UserBean userBean = (UserBean) session.getAttribute("user");
		boolean userLoggedIn = userBean != null;
		String welcomeMsg = "Hi, ";
		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userBean.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th></th>\r\n");
      out.write("\t\t\t<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</a>\r\n");
      out.write("\t\t\t\t|");

				
				if (userLoggedIn) {
			
      out.write(" <a\r\n");
      out.write("\t\t\t\thref=\" ");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</a> ");

 	}
 
      out.write("</td>\r\n");
      out.write("\t\t\t<td rowspan=\"2\">\r\n");
      out.write("\t\t\t\t<h1 align=\"right\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/customLogo.png\" width=\"175\"\r\n");
      out.write("\t\t\t\t\t\theight=\"50\">\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th></th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<h3>");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t");

			if (userLoggedIn) {
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th></th>\r\n");
      out.write("\t\t\t<td colspan=\"2\"><font style=\"font-size: 18px\"> <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet\r\n");
      out.write("\t\t\t\t\t\tMeritList</b>\r\n");
      out.write("\t\t\t\t</a> | ");

					if (userBean.getRoleId() == RoleBean.ADMIN) {
				
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | <a\r\n");
      out.write("\t\t\t\t\ttarget=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</b></a> ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.STUDENT) {
 
      out.write(" <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.KIOSK) {
 
      out.write(" <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.FACULTY) {
 			// System.out.println("======>><><>"+userBean.getRoleId());
 
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <br> <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.COLLEGE_SCHOOL) {
 
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | <a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | ");

 	}
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</font></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<hr>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/js/HTMLCalender.js\"></script>\r\n");
      out.write("\t\t");
      in.co.rays.Project_4.Bean.UserBean bean = null;
      bean = (in.co.rays.Project_4.Bean.UserBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.rays.Project_4.Bean.UserBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<h1>User Registration</h1>\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<font color=\"green\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\"> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" name=\"createdBy\" value=\"");
      out.print(bean.getCreatedBy());
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"modifiedBy\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(bean.getModifiedBy());
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\tname=\"createdDatetime\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(DataUtility.getTimestamp(bean.getCreatedDateTime()));
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"modifiedDatetime\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(DataUtility.getTimestamp(bean.getModifiedDateTime()));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">First Name <span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"firstName\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter first name\" size=\"26\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getStringData(bean.getFirstName()));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("firstName", request));
      out.write("\r\n");
      out.write("\t\t\t\t\t</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"padding: 3px\"></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">Last Name <span style=\"color: red\">*</span> :\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"lastName\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter last name\" size=\"26\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getStringData(bean.getLastName()));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("lastName", request));
      out.write("\r\n");
      out.write("\t\t\t\t\t</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"padding: 3px\"></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">Log In <span style=\"color: red\">*</span> :\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"login\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter email id\" size=\"26\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getStringData(bean.getLogin()));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("login", request));
      out.write("\r\n");
      out.write("\t\t\t\t\t</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"padding: 3px\"></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">Gender <span style=\"color: red\">*</span> :\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");

							HashMap map = new HashMap();

							map.put("Male", "Male");
							map.put("Female", "Female");

							String htmlList = HTMLUtility.getList("gender", bean.getGender(), map);
						
      out.write(' ');
      out.print(htmlList);
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("gender", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"padding: 3px\"></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">Date Of Birth <span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"dob\" id=\"udate\"\r\n");
      out.write("\t\t\t\t\t\treadonly=\"readonly\" size=\"26\" placeholder=\"Enter Dob \"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getDateString(bean.getDob()));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("dob", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"padding: 3px\"></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">Mobile No <span style=\"color: red\">*</span> :\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"mobileNo\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter Mobile No\" size=\"26\" maxlength=\"10\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getStringData(bean.getMobileNo()));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("mobileNo", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"padding: 3px\"></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">Password <span style=\"color: red\">*</span> :\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter Password\" size=\"26\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getStringData(bean.getPassword()));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("password", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"padding: 3px\"></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">Confirm Password <span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"confirmPassword\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Re-Enter password\" size=\"26\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getStringData(bean.getConfirmPassword()));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("confirmPassword", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"padding: 3px\"></th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">&nbsp; &emsp; <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tname=\"operation\" value=\"");
      out.print(UserRegistrationCtl.OP_SIGN_UP);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;<input type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(UserRegistrationCtl.OP_RESET);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<style>\r\n");
      out.write("#footer {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("<CENTER>\r\n");
      out.write("\t\t\t<hr>    \r\n");
      out.write("    <H3>&copy; Copyrights RAYS Technologies</H3>\r\n");
      out.write("</CENTER>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
