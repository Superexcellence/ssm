<%@ taglib prefix="lay-verify" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/all.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="layui/css/layui.css" media="all" />
    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="layui/layui.js"></script>
    <script type="text/javascript" src="js/proposal/proposalCX.js"></script>
    <script type="text/javascript" src="js/proposal/proposalPJ.js"></script>
</head>
<body style="background-color: #e6ecf5" class="layui-body">
<div class="book_con01">
    <form id="form_demo" lay-filter="ff" class="layui-form" method="post" enctype="multipart/form-data">
        <input type="hidden" id="proid" name="proid">
        <input type="hidden" id="prostate" name="prostate">
        <input type="hidden" id="procase" name="procase">
        <h1 class="book_h01"><input type="text"  class="book_input01" readonly="readonly" name="period" id="period" required lay-verify="required" autocomplete="off"/>届<input type="text" name="next" id="next" readonly="readonly" class="book_input02" lay-verify="required" autocomplete="off"/>次会议第<input type="text"  name="mark" id="mark" class="book_input01" readonly="readonly" required lay-verify="required|mark" autocomplete="off"/>号提案</h1>
        <p class="book_p">
            <table class="book_table" border="1" cellpadding="10">
                <tr><td>
                    <label class="td_label">提案类型</label><i class="i_start"></i>
                </td>
                    <td colspan="5">
                        <select name="protype" disabled="disabled" id="protype" required lay-verify="required" >

                        </select>
                    </td>
                <tr><td>
                    <label class="td_label">案由</label><i class="i_start"></i>
                </td>
                    <td colspan="5">
                        <input type="text" name="proany" readonly="readonly" id="proany"  required  lay-verify="required" autocomplete="off" class="book_input03">
                    </td>

                </tr>
                <tr><td>
                    <label class="td_label">提案类别</label><i class="i_start"></i>
                </td>
                    <td colspan="5">
                        <select class="find_input" disabled="disabled" id="procategory" name="procategory" >
                        </select>
                    </td>
                </tr>
                <tr><td><label class="td_label">第一提案人</label><i class="i_start"></i></td>
                    <td ><input type="text" class="book_input03" readonly="readonly" id="protar" name ="protar" required lay-verify="required" autocomplete="off"/></td>

                    <td><label class="td_label">名次</label></td>
                    <td>
                        <input type="text" name="promc" id="promc" readonly="readonly" class="book_input03" required lay-verify="required" autocomplete="off"/>
                    </td>
                    <td><label class="td_label">党派</label></td>
                    <td>
                        <input type="text" name="prodp" id="prodp" readonly="readonly" class="book_input03" required lay-verify="required" autocomplete="off"/>
                    </td>
                </tr>
                <tr><td><label class="td_label">委员证号</label></td>
                    <td ><input type="text" name="prowyzh" id="prowyzh" readonly="readonly" class="book_input03" required lay-verify="required" autocomplete="off"/></td>

                    <td><label class="td_label">邮政编号</label></td>
                    <td>
                        <input type="text" name="postcode" id="postcode" readonly="readonly" class="book_input03" required lay-verify="postcode" autocomplete="off"/>
                    </td>
                    <td><label class="td_label">联系电话</label></td>
                    <td>
                        <input type="text" name="protel" id="protel" readonly="readonly" class="book_input03" required lay-verify="required|phone" autocomplete="off"/>
                    </td>
                </tr>
                <tr> <td><label class="td_label">单位及职务</label></td>
                    <td colspan="2">
                        <input type="text" name="prodwjzw" id="prodwjzw" readonly="readonly"  class="book_input03" required lay-verify="required" autocomplete="off"/>
                    </td>
                    <td><label class="td_label">E-Mail</label></td>
                    <td colspan="2">
                        <input type="email" name="proemail" id="proemail" readonly="readonly" class="book_input03" required lay-verify="required|email" autocomplete="off"/>
                    </td>

                </tr>
                <tr> <td><label class="td_label">通讯地址</label></td>
                    <td colspan="5">
                        <input type="text" name="protxdz" id="protxdz" readonly="readonly" class="book_input03" required lay-verify="required" autocomplete="off"/>
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
                    <textarea  class="textArae" name="protanr" readonly="readonly" id="editor"  required lay-verify="required" autocomplete="off" style="height: 200px;"></textarea>
                </td>

                </tr>
                <tr><td colspan="3"><label class="td_label">提案日期</label></td>
                    <td colspan="3">
                        <input type="date" class="book_input03" readonly="readonly" name="prodate"  id="demo" required lay-verify="required" autocomplete="off"/>
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
                <input type="checkbox" id="proxgqk" readonly="readonly" name="proxgqk" title="同意公开发表">
            </td>

        </tr>
        <tr><td colspan="2"><label class="td_label">希望办理的承办单位（供参考）</label></td>
            <td colspan="4">
                <select name="procbdw" id="procbdw" disabled="disabled" required lay-verify="required">
                </select>
            </td>

        </tr>
        <tr><td><label class="td_label">提案联系人</label></td>
            <td colspan="5">
                <input type="text" name="prolxrxm" readonly="readonly"  id="prolxrxm" placeholder="输入姓名" class="book_input03" required lay-verify="required" autocomplete="off"/>
                <input type="text" name="prolxrdw" readonly="readonly" placeholder="输入单位" id="prolxrdw" class="book_input03" required lay-verify="required" autocomplete="off"/>
                <input type="text" name="prolxrdh" readonly="readonly" placeholder="输入电话" id="prolxrdh" class="book_input03" required lay-verify="required|phone" autocomplete="off"/>
            </td>
        </tr>
        <tr><td><label class="td_label">提案联名人</label></td>
            <td colspan="5">
                <input type="text" name="joinid" readonly="readonly" id="joinid" placeholder="输入提案联名人" class="book_input03" autocomplete="off"/>
            </td>
        </tr>
        <tr><td><label class="td_label">提案评价</label></td>
            <td colspan="6">
                <textarea  class="textArae" name="propj" id="propj" required lay-verify="required" autocomplete="off" style="height: 200px;"></textarea>
            </td>
        </tr>

        </table>
        </p>
        <p class="book_foot">
            <button type="button" class="layui-btn" lay-submit lay-filter="form" id="evaluate">评价</button>
            <%--<button type="button" class="layui-btn"  lay-filter="form" id="check">审核</button>--%>
            <%--<button type="reset" class="layui-btn" id="reset">取消</button>--%>
        </p>
    </form>
</div>
</body>
</html>
