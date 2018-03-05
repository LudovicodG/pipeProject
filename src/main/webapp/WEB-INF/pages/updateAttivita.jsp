
	<%@include file="head.jsp" %>

<body>
	<!-- BARRA LATERALE -->
	<div class="container-fluid">
		<div class="row content">
			<%@include file="barraLaterale.jsp" %>

			<!-- SEZIONE PRINCIPALE -->
			<div class="col-sm-10">
				<div class="container" style="margin-top: 50px;">
					<h1 style="text-align: center;">Modifica Attività:</h1>
					<form>
						<div class="form-group">
							<label for="matricola">ID:</label> 
							<input type="text" class="form-control" id="ID" placeholder="Inserisci ID">
						</div>
						<div class="form-group">
							<label for="nome">Nome:</label> 
							<input type="text" class="form-control" id="nome" placeholder="Inserisci nome">
						</div>
						<div class="form-group">
							<label for="nome">Descrizione:</label> 
							<input type="text" class="form-control" id="descrizione" placeholder="Inserisci descrizione">
						</div>
						<div class="form-group">
							<label for="nome">Data inizio:</label> 
							<input type="text" class="form-control" id="dataInizio" placeholder="Inserisci data inizio">
						</div>
						<div class="form-group">
							<label for="nome">Data fine:</label> 
							<input type="text" class="form-control" id="dataFine" placeholder="Inserisci data fine">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- FOOTER -->
		<footer class="container-fluid">
			<%@include file="footer.jsp" %>
</footer>