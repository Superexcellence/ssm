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
        <input type="hidden" id="prostate" name="prostate">
        <input type="hidden" id="procase" name="procase">
        <h1 class="book_h01"><input type="text" class="book_input01" name="period" id="period" required lay-verify="required" autocomplete="off"/>届<input type="text" name="next" id="next" class="book_input02" lay-verify="required" autocomplete="off"/>次会议第<input type="text" name="mark" id="mark" class="book_input01" required lay-verify="required|mark" autocomplete="off"/>号提案</h1>
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
                    <input type="text" name="proany" required  lay-verify="required" autocomplete="off" class="book_input03">
                </td>

            </tr>
            <tr><td>
                <label class="td_label">提案类别</label><i class="i_start"></i>
            </td>
                <td colspan="5">
                    <select class="find_input" id="procategory" name="procategory">
                    </select>
                </td>
            </tr>
            <tr><td><label class="td_label">第一提案人</label><i class="i_start"></i></td>
                <td ><input type="text" class="book_input03" name ="protar" required lay-verify="required" autocomplete="off"/></td>

                <td><label class="td_label">名次</label></td>
                <td>
                    <input type="text" name="promc" class="book_input03" required lay-verify="required" autocomplete="off"/>
                </td>
                <td><label class="td_label">党派</label></td>
                <td>
                    <input type="text" name="prodp" class="book_input03" required lay-verify="required" autocomplete="off"/>
                </td>
            </tr>
            <tr><td><label class="td_label">委员证号</label></td>
                <td ><input type="text" name="prowyzh" class="book_input03" required lay-verify="required" autocomplete="off"/></td>

                <td><label class="td_label">邮政编号</label></td>
                <td>
                    <input type="text" name="postcode" class="book_input03" required lay-verify="postcode" autocomplete="off"/>
                </td>
                <td><label class="td_label">联系电话</label></td>
                <td>
                    <input type="text" name="protel" class="book_input03" required lay-verify="required|phone" autocomplete="off"/>
                </td>
            </tr>
            <tr> <td><label class="td_label">单位及职务</label></td>
                <td colspan="2">
                    <input type="text" name="prodwjzw" class="book_input03" required lay-verify="required" autocomplete="off"/>
                </td>
                <td><label class="td_label">E-Mail</label></td>
                <td colspan="2">
                    <input type="email" name="proemail" class="book_input03" required lay-verify="required|email" autocomplete="off"/>
                </td>

            </tr>
            <tr> <td><label class="td_label">通讯地址</label></td>
                <td colspan="5">
                    <input type="text" name="protxdz" class="book_input03" required lay-verify="required" autocomplete="off"/>
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
                <textarea  class="textArae" name="protanr" id="editor" required lay-verify="required" autocomplete="off" style="height: 60px;" ></textarea>
            </td>

            </tr>
            <tr><td colspan="3"><label class="td_label">提案日期</label></td>
                <td colspan="3">
                    <input type="date" class="book_input03" name="prodate" id="demo" required lay-verify="required" autocomplete="off"/>
                </td>

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
                        <button type="button" class="layui-btn layui-btn-normal" id="testList">选择文件</button>
                        <button type="button" class="layui-btn" id="testListAction">开始上传</button>
                    </div>
                    <p><label style="color: red">附件总大小不能超过50M，超过限制,将不能发送</label></p>
                    <input type="hidden" id="fileid" name="fileid">
                </td>

        </tr>
        <tr><td><label class="td_label">相关情况</label></td>
            <td colspan="5">
                <input type="checkbox" id="proxgqk" name="proxgqk" title="同意公开发表" checked>
            </td>

        </tr>
        <tr><td colspan="2"><label class="td_label">希望办理的承办单位（供参考）</label></td>
            <td colspan="4">
                <select name="procbdw" required lay-verify="required">
                </select>
            </td>

        </tr>
        <tr><td><label class="td_label">提案联系人</label></td>
            <td colspan="5">
                <input type="text" name="prolxrxm" placeholder="输入姓名" class="book_input03" required lay-verify="required" autocomplete="off"/>
                <input type="text" name="prolxrdw" placeholder="输入单位" class="book_input03" required lay-verify="required" autocomplete="off"/>
                <input type="text" name="prolxrdh" placeholder="输入电话" class="book_input03" required lay-verify="required|phone" autocomplete="off"/>
            </td>
        </tr>
        <tr><td><label class="td_label">提案联名人</label></td>
            <td colspan="5">
                <input type="text" name="joinid" placeholder="输入提案联名人" class="book_input03" autocomplete="off"/>
            </td>
        </tr>

        </table>
        </p>
        <p class="book_foot">
            <button type="button" class="layui-btn" lay-submit lay-filter="form" id="bindAction">立即提交</button>
            <button type="button" class="layui-btn" lay-submit lay-filter="form" id="save">存为草稿</button>
            <button type="reset" class="layui-btn" id="reset">取消</button>
        </p>
    </form>
</div>
</body>
</html>
