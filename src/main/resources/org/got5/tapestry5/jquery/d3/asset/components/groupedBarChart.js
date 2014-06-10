(function( $ ) {

	$.extend(Tapestry.Initializer, {
	
		groupedBarChart : function(spec) {

            //var n = 20, // number of samples
            //m = 4; // number of series

	        //var data = d3.range(m).map(function() { return d3.range(n).map(Math.random); });
			var data= spec.dataSet;
			var id= spec.id;
			
			var m= data.length;
			var n= data[0].length;
			
			

	        var margin = {top: 20, right: 30, bottom: 30, left: 40},
	            width = 960 - margin.left - margin.right,
	            height = 500 - margin.top - margin.bottom;

	        var y = d3.scale.linear()
	            .domain([0, 1])
	            .range([height, 0]);
	
	        var x0 = d3.scale.ordinal()
	            .domain(d3.range(n))
	            .rangeBands([0, width], .2);
	
	        var x1 = d3.scale.ordinal()
	            .domain(d3.range(m))
	            .rangeBands([0, x0.rangeBand()]);
	
	        var z = d3.scale.category10();
	
	        var xAxis = d3.svg.axis()
	            .scale(x0)
	            .orient("bottom");
	
	        var yAxis = d3.svg.axis()
	            .scale(y)
	            .orient("left");
	
	        var svg = d3.select("#" + id).append("svg")
	            .attr("width", width + margin.left + margin.right)
	            .attr("height", height + margin.top + margin.bottom)
	          .append("svg:g")
	            .attr("transform", "translate(" + margin.left + "," + margin.top + ")");
	
	        svg.append("g")
	            .attr("class", "y axis")
	            .call(yAxis);
	
	        svg.append("g")
	            .attr("class", "x axis")
	            .attr("transform", "translate(0," + height + ")")
	            .call(xAxis);
	
	        svg.append("g").selectAll("g")
	            .data(data)
	          .enter().append("g")
	            .style("fill", function(d, i) { return z(i); })
	            .attr("transform", function(d, i) { return "translate(" + x1(i) + ",0)"; })
	          .selectAll("rect")
	            .data(function(d) { return d; })
	          .enter().append("rect")
	            .attr("width", x1.rangeBand())
	            .attr("height", y)
	            .attr("x", function(d, i) { return x0(i); })
	            .attr("y", function(d) { return height - y(d); }); 
	            
            
            
		}
	});
	
}) ( jQuery );