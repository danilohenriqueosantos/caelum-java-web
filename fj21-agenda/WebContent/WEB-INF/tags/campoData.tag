<%@ attribute name="id" required="true"%>

<div class="form-group form-check">
	<input type="text" class="form-control" placeholder="Data Nascimento" id="${id}" name="${id}" autocomplete="off" />
</div>
<script>
	$("#${id}").datepicker({
		dateFormat : 'dd/mm/yy'
	});
</script>