<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="icon" href="favicon.ico">
    <link rel="stylesheet" href="layui/css/layui.css" media="all" />
    <script type="text/javascript" src="layui/layui.js"></script>
    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="js/proposal/proposalPJ.js"></script>
</head>
<body>
<div class="layui-fluid layui-form" style="margin-top: 10px;">
    <div class="layui-row layui-col-space5">
        <div class="layui-col-lg3">
            <label class="layui-form-label">届次：</label>
            <div class="layui-input-block">
                <select class="find_input" id="period" name="period">
                </select>
            </div>
        </div>
        <div class="layui-col-lg3">
            <label class="layui-form-label">提案号：</label>
            <div class="layui-input-block">
                <input type="text" id="mark" class="layui-input" autocomplete="off">
            </div>
        </div>
        <div class="layui-col-lg3">
            <label class="layui-form-label">提案类型：</label>
            <div class="layui-input-block">
                <select class="find_input" id="protype" name="protype">
                </select>
            </div>
        </div>
    </div>
    <div class="layui-row layui-col-space5">
        <div class="layui-col-lg3">
            <label class="layui-form-label">承办单位：</label>
            <div class="layui-input-block">
                <select class="find_input" id="procbdw" name="procbdw">
                </select>
            </div>
        </div>
        <div class="layui-col-lg3">
            <label class="layui-form-label">提案类别：</label>
            <div class="layui-input-block">
                <select class="find_input" id="procategory" name="procategory">
                </select>
            </div>
        </div>
        <div class="layui-col-lg3">
            <label class="layui-form-label">提案状态：</label>
            <div class="layui-input-block">
                <select class="find_input" id="prostate" name="prostate">
                </select>
            </div>
        </div>
        <div class="layui-col-lg3">
            <button class="layui-btn layui-col-lg1 layui-btn layui-btn-sm" id="query" style="height: 40px;width: 100px;"> 查询</button>
        </div>
    </div>
</div>
<div>
    <table class="layui-hide" id="tb" lay-filter="tb"></table>
</div>
</body>
</html>
