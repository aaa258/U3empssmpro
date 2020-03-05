<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2020/2/9
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="static/css/bootstrap.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="static/css/bootstrap-theme.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="static/js/jquery-1.9.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="/static/js/bootstrap.js"></script>
    <script type="text/javascript" language="JavaScript">
        function go(page) {
            document.getElementById("setPage").value=page;
            document.getElementById("form1").submit();
        }
        function adde() {
            location.href="addshowemp";
        }
        function selectAll(){
            var ary=document.getElementsByName("CheckboxGroup");
            for(var i=0;i<ary.length;i++){
                if(ary[i].checked){
                    ary[i].checked=false;
                }else{
                    ary[i].checked=true;}
            }
        }
    </script>
</head>
<body>
<div align="center"><h2>员工信息管理系统</h2></div>

<form id="form1" name="form1" method="post" action="showempinfo">
    <div align="center">
    <p>姓名:
        <label for="textfield"></label>
        <input type="text" name="ename" id="textfield" size="10px" value="${pageCondition.ename}" />
        入职日期:
        <label for="textfield2"></label>
        <label for="textfield2"></label>
        <input type="date" name="startestartime" id="textfield2" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${pageCondition.startestartime}"></fmt:formatDate>" />
        -
        <label for="textfield3"></label>
        <input type="date" name="endestartime" id="textfield3" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${pageCondition.endestartime}"></fmt:formatDate>" />
        部门名称:
        <label for="select"></label>
        <select name="did" id="select">
            <option value="">全部</option>
            <c:forEach items="${deptList}" var="d">
                <option ${d.did==pageCondition.did?"selected":""} value="${d.did}">${d.dname}</option>
            </c:forEach>
        </select>
        <input type="hidden" name="page" id="setPage" value="1" />
        <input type="submit" name="button" id="button" value="查询" />
        <input type="button" name="button2" id="addemp" value="添加员工" onclick="adde()" />
    </p>
    </div>
    <div align="center">
    <table width="950" border="1">
        <tr>
            <td width="151" align="center"><p>
                <label>
                    <input type="checkbox" name="CheckboxGroup" value="全选" id="CheckboxGroup1_0" onclick="selectAll();"/>
                    全选</label>
                <br />
            </p></td>
            <td width="84">编号</td>
            <td width="84">姓名</td>
            <td width="84">性别</td>
            <td width="98">入职时间</td>
            <td width="147">工资</td>
            <td width="106">部门名称</td>
            <td width="144">操作</td>
        </tr>
        <c:forEach items="${pageInfo.list}" var="emp">
        <tr>
            <td align="center"><label>
                <input type="checkbox" name="CheckboxGroup" value="${emp.eid}" id="CheckboxGroup1_1" />
            </label></td>
            <td>${emp.eid}</td>
            <td>${emp.ename}</td>
            <td>${emp.esex}</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${emp.estartime}"></fmt:formatDate></td>
            <td>${emp.epay}</td>
            <td>${emp.dname}</td>
            <td><a href="updateshowemp?eid=${emp.eid}"> 修改 </a> <a href="javascript:if(confirm('确定删除吗?')){location.href='deletemp?eid=${emp.eid}'}"> 删除 </a> </td>
        </tr>
        </c:forEach>
        <tr>
            <td colspan="8" align="center">
                <ul class="pagination pagination-sm" style="margin: 0px">
                    <li>
                        <a href="javascript:go(1)" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <c:forEach begin="1" end="${pageInfo.pages}" var="p">
                        <li><a href="javascript:go(${p})">${p}</a></li>
                    </c:forEach>
                    <li>
                        <a href="javascript:go(${pageInfo.pages})" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </td>
        </tr>
    </table>
    </div>
    <p>&nbsp;</p>
</form>
</body>
</html>
