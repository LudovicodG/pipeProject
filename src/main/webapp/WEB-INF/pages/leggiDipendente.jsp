<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
	<title> Homepage di PippeProject</title>
	<%@include file="head.jsp" %>
	<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css">
	<script>
		$(document).ready(function()
		{
			$('#dipendenti').DataTable();
			$('[data-toggle="tooltip"]').tooltip();
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
				<h1>leggiDipendenti</h1>
				<hr id="partenza" />
				
				<a href="addDipendente"><button type="button" data-toggle="tooltip" title="Aggiungi un nuovo dipendente" class="btnAddItem btn-success"><b>+</b></button></a>
				<br/>
				<table id="dipendenti" class="table table-striped table-bordered dataTable" cellspacing="0" width="100%" role="grid" style="width: 100%;">
					<thead>
						<tr role="row">
							<th class="sorting" style="width: 101px;">Matricola</th>
							<th class="sorting" style="width: 165px;">Nome</th>
							<th class="sorting" style="width: 73px;">Cognome</th>
							<th class="sorting" style="width: 28px;">Ruolo</th>
							<th class="sorting" style="width: 28px;">E-mail</th>
							
							<th class="sorting" style="width: 28px;">-</th>
							<th class="sorting" style="width: 28px;">-</th>
							<th class="sorting" style="width: 28px;">Pag. personale</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="dipendente" items="${dipendente}">
						<tr role="row">
							<td>${dipendente.matricola}</td>
							<td>${dipendente.nome}</td>
							<td>${dipendente.cognome}</td>
							<td>${dipendente.ruolo}</td>
							<td>${dipendente.e_mail}</td>
							<td><a href="updateDipendente?matricola=${dipendente.matricola}">Modifica</a></td>
							<td><a href="deleteDipendente?matricola=${dipendente.matricola}">Cancella</a></td>
							<td><a href="attivitaDipendente?matricola=${dipendente.matricola}">Vai</a></td>
						</tr>
						</c:forEach>									
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<!-- FOOTER -->
	<footer class="container-fluid">
			<%@include file="footer.jsp" %>
</footer>