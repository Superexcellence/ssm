<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="icon" href="favicon.ico">
    <link rel="stylesheet" href="layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="css/all.css"/>
    <script type="text/javascript" src="layui/layui.js"></script>
    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script  src="js/echarts/echarts-all.js"></script>
    <script  src="js/proposal/proposalStatistics.js"></script>
</head>
<body style="background-color: #e6ecf5" class="layui-body">
<form class="layui-form">
    <div class="book_con01">
        <p class="book_p">
        <table class="book_table" border="1" cellpadding="10">
            <tr>
                <td class="tr_color" colspan="4">
                    提交提案数据汇总表
                </td>
            </tr>
            <tr>
                <td><label class="td_label">届次</label></td>
                <td colspan="3">
                    <select class="find_input" id="period" name="period">
                    </select>
                </td>
            </tr>
            <tr>
                <td><label class="td_label">总共提案</label></td>
                <td  style="color: red" colspan="3" id="d3"></td>

            </tr>
            <tr>
                <td><label class="td_label">未分类提案</label></td>
                <td  style="color: red" id="d1" ></td>
                <td><label class="td_label">未审核提案</label></td>
                <td  style="color: red" id="d2"></td>

            </tr>
            <tr>
                <td colspan="4" style="text-align:center;vertical-align:middle;"><button type="button" class="layui-btn layui-col-lg1 layui-btn layui-btn-sm" id="query" style="height: 40px;width: 100px;"> 查询</button></td>
            </tr>
        </table>
        <p class="my_static" id="chart">
        </p>
        <%--<p class="book_foot"><input type="button" value="导出"/><input type="button" value="打印"/><input type="button" value="关闭"/></p>--%>
    </div>
</form>
</body>
</html>
