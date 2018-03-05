<!DOCTYPE html>


<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<title> Homepage di PippeProject</title>
	<%@include file="head.jsp" %>
	<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css">
	<script>
		$(document).ready(function()
		{
			$('#attivita').DataTable();
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
				<h1>leggiAttivita</h1>
				<hr id="partenza" />

				<a href="addAttivita"><button type="button" id="addButton" data-toggle="tooltip" title="Aggiungi una nuova attivitaS " class="btnAddItem btn-success">+</button></a>
				<br/>
				<table id="attivita" class="table table-striped table-bordered dataTable" cellspacing="0" width="100%" role="grid" style="width: 100%;">
					<thead>
						<tr role="row">
							<th class="sorting" style="width: 101px;">ID</th>
							<th class="sorting" style="width: 165px;">Nome</th>
							<th class="sorting" style="width: 73px;">Descrizione</th>
							<th class="sorting" style="width: 28px;">Data inizio</th>
							<th class="sorting" style="width: 65px;">Data fine</th>
							<th class="sorting" style="width: 65px;">Dipendente associato</th>
							<th class="sorting" style="width: 28px;">-</th>
							<th class="sorting" style="width: 28px;">-</th>
							<!--  tabindex="0" aria-controls="example" rowspan="1" colspan="1" -->
						</tr>
					</thead>
					<tbody>
						<c:forEach var="attivita" items="${attivita}">
						<tr role="row">
							<td>${attivita.id}</td>
							<td>${attivita.nome}</td>
							<td>${attivita.descrizione}</td>
							<td>${attivita.inizio}</td>
							<td>${attivita.fine}</td>
							<td>${attivita.dipendente}</td>
							<td><a href="updateAttivita?id=${attivita.id}">Modifica</a></td>
							<td><a href="deleteAtt?id=${attivita.id}">Cancella</a></td>
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