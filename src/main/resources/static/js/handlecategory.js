var subjectCategory= $('#subjectCategory');
$(function(){
    var show=$('#show');
    var categoryTemplate="<tr><td>{{id}}</td><td>{{subjectCategory}}</td>" +
                            "<td><button class='edit btn btn-primary'> Edit </button></td> " +
                           "<td><button id={{id}} class='remove btn btn-danger'> X </button></td> </tr>";

    function addCategory(category){
    show.append(Mustache.render(categoryTemplate, category));
    }

    $.ajax({
        url: 'getcategories',
        type:'GET',
        success : function(categories) {

            $.each(categories, function(i, category){
            addCategory(category);
            });
        },
        error: function(){
        			alert('error in loading');
        		}
    });

    show.delegate('.remove', 'click', function(){
    		var tr = $(this).closest('tr');
    		$.ajax({
    			url : '/deletecategory/' + $(this).attr('id'),
    			type:'DELETE',
    			success : function()
    			{
    				tr.remove();
    			}
    		});
    	});

    $('#update').on('click',function(){
     var categoryvalue = $(this);
     $(".edit").click(function(){
       $("#subjectCategory").val(categoryvalue);
     });
    		var category={
    				subjectCategory : subjectCategory.val(),
    				id : $(this).attr('id'),
    				};

    			$.ajax({
    				type : 'PUT',
    				url : 'editcategory',
    				data : feedback,
    				success : function(){
    					{addCategory(category);}
    				},
    				error: function(){
    					alert('error in loading');}

    				});
    	});

});