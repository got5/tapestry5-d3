(function( $ ) {

	$.extend(Tapestry.Initializer, {
	
		d3barChart : function(spec) {
			
			var elementId= spec.id;
			var dataset= spec.dataSet;

			
            d3.select('#' + elementId).selectAll('p')
            .data(dataset)
            .enter()
            .append('div')
            .attr('class', 'bar')
            .style('height', function(d){
                return d*5 + 'px';
            })
            .style('margin', 'margin-right: 2px');			
		}
	});
	
}) ( jQuery );