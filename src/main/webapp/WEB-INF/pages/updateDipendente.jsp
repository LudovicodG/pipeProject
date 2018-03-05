
		<%@include file="head.jsp" %>
</head>
<body>
	<!-- BARRA LATERALE -->
	<div class="container-fluid">
		<div class="row content">
			<%@include file="barraLaterale.jsp" %>

			<!-- SEZIONE PRINCIPALE -->
			<div class="col-sm-10">
				<div class="container" style="margin-top: 50px;">
						<h1 style="text-align:center;">Aggiorna Dipendente:</h1>
						
					<form:form method="POST" action="updateDip-?matricola=${dipendente.matricola}" modelAttribute="dipendente">
						<div class="form-group">
						<label for="matricola">Matricola:</label>
						<form:input type="text" path="id" class="form-control" id="matricola" placeholder="Inserisci matricola"/>
						</div>
						<div class="form-group">
						<label for="nome">Nome:</label>
						<form:input type="text" path="id" class="form-control" id="nome" placeholder="Inserisci nome"/>
						</div>
						<div class="form-group">
						<label for="nome">Cognome:</label>
						<form:input type="text" path="id" class="form-control" id="cognome" placeholder="Inserisci cognome"/>
						</div>
						<div class="form-group">
						<label for="nome">Ruolo:</label>
						<form:input type="text" path="id" class="form-control" id="ruolo" placeholder="Inserisci ruolo"/>
						</div>
						<form:input type="submit" class="btn btn-default" value="Aggiorna" path="aggiorna"/>
					</form:form>
					</div>
			</div>
		</div>
	</div>

	<!-- FOOTER -->
		<footer class="container-fluid">
			<%@include file="footer.jsp" %>
</footer>