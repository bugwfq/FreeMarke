<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Insert title here</title> 
</head> 
<body> 
(��map�е�   kay  -  valuel��ȡ��Ӧ��ֵ��    el���ʽ   ����)
  ����������    ${username}      
  
 �ڶ���Map �е���ͨ��ֵ     ${valueMap.valueMapFirst}
 
�������list�д���user�����name   ${valueMap.list[1].name}
<#--�������-->
<#assign i = 0/>
${i}
<#--���ٶ���һ�����伯��-->
<#assign i = 1..100/>
<#assign temp = "����ǿ"/>
${temp}
<#list i as temp>
${temp}
</#list>



  
</body> 
</html> 