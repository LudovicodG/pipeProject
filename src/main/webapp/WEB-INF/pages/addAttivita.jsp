<%@include file="head.jsp"%>

<body>
	<!-- BARRA LATERALE -->
	<div class="container-fluid">
		<div class="row content">
			<%@include file="barraLaterale.jsp"%>

			<!-- SEZIONE PRINCIPALE -->
			<div class="col-sm-10">
				<div class="container" style="margin-top: 50px;">
					<h1 style="text-align: center;">Aggiungi Attivita :</h1>
					<form:form method="POST" action="addAttivita"
						modelAttribute="attivita">

						<div class="form-group">
							<label for="nome">Nome:</label>
							<form:input type="text" path="nome" class="form-control"
								id="nome" placeholder="Inserisci nome" />
						</div>
						<div class="form-group">
							<label for="descrizione">Descrizione:</label>
							<form:input type="text" path="descrizione" class="form-control"
								id="descrizione" placeholder="Inserisci descrizione" />
						</div>


						<!-- ------Data Inizio------------- -->
						<script>
							$(document).ready(function() {
								$('#dataInizio').datepicker({
									uiLibrary : 'bootstrap',
									format : 'dd/mm/yy'
								});
								$('#dataFine').datepicker({
									uiLibrary : 'bootstrap',
									format : 'dd/mm/yy'
								});
							});
						</script>
						<label for="dataInizio">Data Inizio:</label>
						<form:input id="dataInizio" path="inizio" />
						<!-- ---Data Fine------- -->

						<label for="dataFine">Data Fine:</label>
						<form:input id="dataFine" path="fine" />
						<label for="sel1">Lista Dipendenti:</label>
						<form:select class="form-control" id="sel1" path="dipendente"
							multiple="true">
							<form:options items="${listDipendenti}" itemValue="nome"
								itemLabel="nome" />

						</form:select>
						<input type="submit" class="btn btn-default" value="Aggiungi" />
					</form:form>
				</div>
			</div>
		</div>
	</div>

	<!-- FOOTER -->
	<footer class="container-fluid">
		<%@include file="footer.jsp"%>
	</footer>