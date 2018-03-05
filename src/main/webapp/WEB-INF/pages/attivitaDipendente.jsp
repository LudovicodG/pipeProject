
	<%@include file="head.jsp" %>
	<link rel="stylesheet" href="../css/timeline.css">
	<script>
		$(document).ready(function()
		{
			mesi=new Array();
			mesi.push("Gennaio");
			mesi.push("Febbraio");
			mesi.push("Marzo");
			mesi.push("Aprile");
			mesi.push("Maggio");
			mesi.push("Giugno");
			mesi.push("Luglio");
			mesi.push("Agosto");
			mesi.push("Settembre");
			mesi.push("Ottobre");
			mesi.push("Novembre");
			mesi.push("Dicembre");

			s="<br/>Mese: <select id=\"meseSel\">\n";
			for(let i=0;i<mesi.length;i++)
				s+="<option value="+mesi[i]+">"+mesi[i]+"</option>\n";
			s+="</select>\n";

			$("#partenza").after(s);

			s="";

			s="<br/>Anno: <select id=\"annoSel\" onchange=\"leggiData();\">\n";
			for(let anno=1990;anno<2019;anno++)
				s+="<option value="+anno+">"+anno+"</option>\n";
			s+="</select>\n";

			$("#meseSel").after(s);
		});
	</script>
</head>
<body>
	<!-- BARRA LATERALE -->
	<div class="container-fluid">
		<div class="row content">
			<%@include file="barraLaterale.jsp" %>

			<!-- SEZIONE PRINCIPALE -->
			<div class="col-sm-10">
				<%int c=0;%>
				<c:forEach var="item" items="${attivita}">
					<c:choose>
						<c:when test="<% c%2==0; %>">
							<div class="container left">
								<div class="content">
									<h2>${item.nome}</h2>
									<h4>${item.dataInizio} - </h4>
									<h4>${item.dataFine}</h4>
									<p>${item.descrizione}</p>
								</div>
								</div>
						</c:when>    
						<c:otherwise>
							<div class="container right">
								<div class="content">
									<h2>${item.nome}</h2>
									<h4>${item.dataInizio} - </h4>
									<h4>${item.dataFine}</h4>
									<p>${item.descrizione}</p>
								</div>
								</div>
						</c:otherwise>
					</c:choose>
					<%c++;%>
				</c:forEach>
			</div>
		</div>
	</div>

	<!-- FOOTER -->
			<footer class="container-fluid">
			<%@include file="footer.jsp" %>
</footer>