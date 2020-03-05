<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2020/2/9
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center"><h2>添加员工信息
</h2>
</div>
<div align="center">
    <form id="form1" name="form1" method="post" action="addemp">
        <table width="600" border="1">
            <tr>
                <td width="153">姓名</td>
                <td width="431"><label for="textfield2"></label>
                    <input type="text" name="ename" id="textfield2" /></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" name="esex" id="radio" value="男" />
                    <label for="radio">男
                        <input type="radio" name="esex" id="radio2" value="女" />
                        女</label></td>
            </tr>
            <tr>
                <td>入职时间</td>
                <td><label for="textfield3"></label>
                    <input type="date" name="estartime" id="textfield3" /></td>
            </tr>
            <tr>
                <td>工资</td>
                <td><label for="textfield4"></label>
                    <input type="text" name="epay" id="textfield4" /></td>
            </tr>
            <tr>
                <td>所属部门</td>
                <td><label for="select"></label>
                    <select name="did" id="select">
                        <option value="">全部</option>
                        <c:forEach items="${deptList}" var="d">
                        <option value="${d.did}">${d.dname}</option>
                        </c:forEach>
                    </select></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="button" id="button" value="添加" /></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
