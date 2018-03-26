<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>HTML2PDF</title>
<style type="text/css">
body {
	font-family: SimSun;
}

table.gridtable {
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
	margin-top:10px;
	width: 100%;
}
.title {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
	text-align:center;
}
.content {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
	text-align:center;
}
.line{
	height:2px;
	background-color: #dedede;
}
</style>
</head>
<body>
<h2><font color="#6666ff">HTML2PDF</font></h2>
<center>
<div class="line"></div>
<table class="gridtable">
	<tr>
    	<th class="title">A</th>
        <th class="title">B</th>
        <th class="title">C</th>
        <th class="title">D</th>
        <th class="title">E</th>
        <th class="title">F</th>
     </tr>
	 <#list list as item>
		<tr>
			<td class="content">${item.a}</td>
			<td class="content">${item.b}</td>
			<td class="content">${item.c}</td>
			<td class="content">${item.d}</td>
			<td class="content">${item.e}</td>
			<td class="content">${item.f}</td>
		</tr>
	</#list>
</table>
</center>
</body>
</html>
