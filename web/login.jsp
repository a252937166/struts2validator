<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/9
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:fielderror></s:fielderror>
    <form action="/struts2validator/user/user_login.action" method="post">
        姓名：<input type="text" name="username" />
        <br />
        密码：<input type="password" name="password" />
        <br />
        mobile：<input type="text" name="mobile" />
        <br />
        <input type="submit" value="登陆" />
    </form>
    <br />
    <a href="/struts2validator/user/user_update.action">修改</a>
</body>
</html>
