<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Insert title here</title> 
</head> 
<body> 
(根map中的   kay  -  valuel获取对应的值与    el表达式   相似)
  作者姓名：    ${username}      
  
 第二层Map 中的普通键值     ${valueMap.valueMapFirst}
 
第三层的list中存入user对象的name   ${valueMap.list[1].name}
<#--定义变量-->
<#assign i = 0/>
${i}
<#--快速定义一个区间集合-->
<#assign i = 1..100/>
<#assign temp = "王福强"/>
${temp}
<#list i as temp>
${temp}
</#list>



  
</body> 
</html> 