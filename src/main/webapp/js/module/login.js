$(function() {
	$
			.Class(
					'defysope.login.MainClass',
					{},
					{
						init : function(el, options) {
							this.el = $(el);
							$.extend(this.options, options);
							$('span.saveUser').on('click',
									this.callback('saveUser'));
							// $('span.editBtn').on('click',
							// $.proxy('editUser'));
							this.el.on('click', 'span.editBtn', this
									.callback('editUser'));
							$('span.deleteBtn').on('click',
									this.callback('deleteUser'));
						},
						saveUser : function() {
							$
									.ajax(
											{
												url : 'saveuser.do',
												data : {

													name : $(
															':input[name="name"]')
															.val(),
													email : $(
															':input[name="email"]')
															.val(),
													password : $(
															':input[name="password"]')
															.val(),
													dob : $(
															':input[name="dob"]')
															.val()
												},
												type : 'POST',
												msgprocessing : {
													hideMessage : true
												}
											})
									.done(
											function(data) {
												var html = '<tr><td>'
														+ data.name
														+ '</td><td>'
														+ data.email
														+ '</td><td>'
														+ data.password
														+ '</td><td><span class="btn btn-warning editBtn" data-cid='
														+ data.cid
														+ '>Edit</span></td></td><td><span class="btn btn-danger deleteBtn" data-cid='
														+ data.cid
														+ '>Delete</span></td>'
												jQuery('table.userTable')
														.append(html)

											});

						},
						editUser : function(e) {
							var el = $(e.currentTarget);
							var id = $(el).data('cid');
							if (id > 0) {
								$.ajax({
									url : 'edituser.do',
									data : {
										cid : id
									},
									type : 'POST',
									msgprocessing : {
										hideMessage : true
									}
								}).done(function(data) {

									console.log(data)

								});

							}
						},
						deleteUser : function(e) {

						}

					});
});