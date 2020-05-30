$(function(){
    $.ajax({
        url: '/question/1',
        type:'GET',
        success : function(question) {
            $('#selectcategory').val(question.subjectCategory);
            $('#question').val(question.question);

        },
        error: function(){
        			alert('error in loading');
        		}
    });


});