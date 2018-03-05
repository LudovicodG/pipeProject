
		<%@include file="head.jsp" %>
<body>
		<!-- BARRA LATERALE -->
		<div class="container-fluid">
				<div class="row content">
						<%@include file="barraLaterale.jsp" %>

				<!-- SEZIONE PRINCIPALE -->
				<div class="col-sm-10">
					<input type="hidden" value="${dipendente.matricola}" name="id">
					<div class="container" style="margin-top: 50px;">
							<h1 style="text-align:center;">Aggiungi Dipendente:</h1>
							<form:form method="POST" action="addDipendente" modelAttribute="dipendente">
							<form:input type="hidden" path="matricola" id="matricola"/>
							<div class="form-group">
							<label for="nome">Nome:</label>
							<form:input type="text" path="nome" class="form-control" id="nome" placeholder="Inserisci nome"/>
							</div>
							<div class="form-group">
							<label for="nome">Cognome:</label>
							<form:input type="text" path="cognome" class="form-control" id="cognome" placeholder="Inserisci cognome"/>
							</div>
							<div class="form-group">
							<label for="nome">Ruolo:</label>
							<form:input type="text" path="ruolo" class="form-control" id="ruolo" placeholder="Inserisci ruolo"/>
							</div>
							<div class="form-group">
							<label for="e-mail">E-mail:</label>
							<form:input type="email" path="e_mail" class="form-control" id="e_mail" placeholder="Inserisci e-mail"/>
							</div>
		
	
							<input type="submit" class="btn btn-default" value="Aggiungi" />
							</form:form>
					</div>
				</div>
			</div>
		</div>

		<!-- FOOTER -->
		<footer class="container-fluid">
			<%@include file="footer.jsp" %>
</footer>