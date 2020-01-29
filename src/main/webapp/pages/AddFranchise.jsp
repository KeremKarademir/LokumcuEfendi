<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="saveFranchiser" method="get"><br>
		<input type="number" name="tc"/><br>
		<input type="text" name="name"/><br>
		<input type="text" name="surname"/><br>
		<textarea name="address" rows="30" cols="50"></textarea><br>
		Telefon : <br>
		+90 <input type="tel" name="phone" pattern="[0-9]{3} [0-9]{3} [0-9]{2} [0-9]{2}"/><br>
		<p>Not: İstenen format 012-345-67-89 şeklindedir.(Örneğin : 541 393 84 04)</p>
		<input type="text" name="dateOfBirth"/><br>
		Daha önce perakende sektöründe çalıştınız mı?<br>
		<input type="radio" name="workedAsRetailer" value="yes"> Evet<br>
  		<input type="radio" name="workedAsRetailer" value="no"> Hayır<br>
  		Lokumcu Efendi'yi tercih etme sebebiniz nedir?<br>
		<textarea name="causeOfPreference" rows="30" cols="50"></textarea><br>
		<p>Hangi il/ilçe/semt için Lokumcu Efendi işletmeciliği düşünüyorsunuz?</p><br/>
		<input type="text" name="locationOfFranchising"/><br>
		<p>Yatırım miktarınız nedir?</p><br/>
		<input type="number" name="amountOfInvestment"/><br/>
		<p>Eklemek istediğiniz ek bilgi var mı?Varsa lütfen aşağıya yazınız:<p><br/>
		<textarea name="additionalInfo" rows="30" cols="50"></textarea><br>
		<input type="submit">
	</form>
</body>
</html>