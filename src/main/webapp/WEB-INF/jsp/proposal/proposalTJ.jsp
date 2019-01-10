<%@ taglib prefix="lay-verify" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/all.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="layui/css/layui.css" media="all" />
    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="layui/layui.js"></script>
    <script type="text/javascript" src="js/proposal/proposalTJ.js"></script>
</head>
<body style="background-color: #e6ecf5" class="layui-body">
<div class="book_con01">
    <form id="form_demo" class="layui-form" method="post" enctype="multipart/form-data">
        <h1 class="book_h01"><input type="text" class="book_input01" required lay-verify="required" autocomplete="off"/>届<input type="text" class="book_input02" lay-verify="required" autocomplete="off"/>次会议第<input type="text" class="book_input01"/>号提案</h1>
        <p class="book_p">
        <table class="book_table" border="1" cellpadding="10">
            <tr><td>
                <label class="td_label">提案类型</label><i class="i_start"></i>
            </td>
                <td colspan="5">
                    <select name="protype" required lay-verify="required">

                    </select>
                </td>
            <tr><td>
                <label class="td_label">案由</label><i class="i_start"></i>
            </td>
                <td colspan="5">
                    <input type="text" name="" required  lay-verify="required" autocomplete="off" class="book_input03">
                </td>

            </tr>
            <tr><td><label class="td_label">第一提案人</label><i class="i_start"></i></td>
                <td ><input type="text" class="book_input03" name ="" required lay-verify="required" autocomplete="off"/></td>

                <td><label class="td_label">名次</label></td>
                <td>
                    <input type="text" class="book_input03" required lay-verify="required" autocomplete="off"/>
                </td>
                <td><label class="td_label">党派</label></td>
                <td>
                    <input type="text" class="book_input03" required lay-verify="required" autocomplete="off"/>
                </td>
            </tr>
            <tr><td><label class="td_label">委员证号</label></td>
                <td ><input type="text" class="book_input03" required lay-verify="required" autocomplete="off"/></td>

                <td><label class="td_label">邮政编号</label></td>
                <td>
                    <input type="text" class="book_input03" required lay-verify="postcode" autocomplete="off"/>
                </td>
                <td><label class="td_label">联系电话</label></td>
                <td>
                    <input type="number" class="book_input03" required lay-verify="phone" autocomplete="off"/>
                </td>
            </tr>
            <tr> <td><label class="td_label">单位及职务</label></td>
                <td colspan="2">
                    <input type="text" class="book_input03" required lay-verify="required" autocomplete="off"/>
                </td>
                <td><label class="td_label">E-Mail</label></td>
                <td colspan="2">
                    <input type="email" class="book_input03" required lay-verify="email" autocomplete="off"/>
                </td>

            </tr>
            <tr> <td><label class="td_label">通讯地址</label></td>
                <td colspan="5">
                    <input type="text" class="book_input03" required lay-verify="required" autocomplete="off"/>
                </td>
            </tr>
            <%--<tr><td><label class="td_label">主题词</label></td>--%>
                <%--<td colspan="5">--%>
                    <%--<input type="file"  value="上传主题词"/>--%>
                <%--</td>--%>
            <%--</tr>--%>
            <tr><td colspan="6"><label class="td_label">提案内容（包括案由、案据和方案）</label></td>

            </tr>
            <tr><td colspan="6">
                <textarea  class="textArae" id="editor" required lay-verify="required" autocomplete="off" ></textarea>
            </td>

            </tr>
            <tr><td colspan="5"><label class="label_right">提案日期</label></td>
                <td> <input type="date" class="book_input03" id="demo" required lay-verify="required" autocomplete="off"/></td>

            </tr>
            <tr ><td>
                <label class="td_label">附件</label>
            </td>
                <td colspan="5">
                    <div class="layui-upload">
                        <div class="layui-upload-list">
                            <table class="layui-table">
                                <thead>
                                <tr><th>文件名</th>
                                    <th>大小</th>
                                    <th>状态</th>
                                    <th>操作</th>
                                </tr></thead>
                                <tbody id="demoList"></tbody>
                            </table>
                        </div>
                        <button type="button" class="layui-btn layui-btn-normal" id="testList">选择多文件</button>
                        <button type="button" class="layui-btn" id="testListAction">开始上传</button>
                    </div>
                </td>

        </tr>
        <tr><td><label class="td_label">相关情况</label></td>
            <td colspan="5">
                <input type="checkbox" name="public" title="同意公开发表" checked>
                <input type="checkbox" name="read" title="同意其它委员参阅">
            </td>

        </tr>
        <tr><td colspan="2"><label class="td_label">希望办理的承办单位（供参考）</label></td>
            <td colspan="4"><input type="button" value="选择单位"/></td>

        </tr>
        <tr><td><label class="td_label">提案联系人</label></td>
            <td colspan="4"><input type="text" placeholder="输入姓名" class="book_input04"/><input type="text" placeholder="输入单位" class="book_input05"/><input type="text" placeholder="输入电话" class="book_input04"/></td>

            <td><input type="button" value="添加提案联系人"/></td>
        </tr>
        <tr><td><label class="td_label">提案联名人</label></td>
            <td colspan="4"><input type="text"  class="book_input03"/></td>

            <td><input type="button" value="添加提案联名人"/></td>
        </tr>

        </table>
        </p>
        <p class="book_foot">
            <button type="submit" class="layui-btn" lay-submit lay-filter="form" id="bindAction">立即提交</button>
            <input type="button" value="存为草稿"/><input type="button" value="重置"/>
            <input type="button" value="取消"/>
        </p>
    </form>
</div>
</body>
</html>
