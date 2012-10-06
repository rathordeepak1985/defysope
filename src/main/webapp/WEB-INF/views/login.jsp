<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript" src="js/jquerymx-3.2.custom.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript" src="js/jsrender.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" type="text/css" href="css/coustom.css" />
<script type="text/javascript" src="js/module/login.js"></script>
<script>
	$(function() {
		new defysope.login.MainClass("#loader-setup", {});
	});
</script>

<div id="loader-setup">
	<div class="row-fluid">
		<div class="span6">
			<table class="table table-bordered userTable">
				<thead>
					<th>Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</thead>
				<tbody>

				</tbody>
			</table>

		</div>
		<div class="span6">
			<div class="well">
				<form class="form-horizontal">
				<input type="hidden"  id="0">
					<div class="control-group">
						<label class="control-label" for="name">Email</label>
						<div class="controls">
							<input type="text" id="inputEmail" placeholder="Email"
								name="name">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="pass">Password</label>
						<div class="controls">
							<input type="password" id="password" placeholder="Password"
								name="password">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="email">Email</label>
						<div class="controls">
							<input type="text" id="email" placeholder="Email" name="email">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="dob">DOB</label>
						<div class="controls">
							<input type="text" id="dob" placeholder="Email" name="dob">
						</div>
					</div>
					<span class="btn btn-primary saveUser offset3">SAVE</span>
				</form>
			</div>
		</div>
	</div>

</div>