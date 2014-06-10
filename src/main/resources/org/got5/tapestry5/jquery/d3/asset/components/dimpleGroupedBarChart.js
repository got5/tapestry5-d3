(function( $ ) {

	$.extend(Tapestry.Initializer, {
	
		dimpleGroupedBarChart : function(spec) {
			
			var elementId= spec.id;
			var dataset= spec.dataSet;
			
			var width= 590;
			var height= 400;
			
			if(spec.extra){
				var extraOpts= spec.extra;
				
				if (extraOpts.width){
					width= extraOpts.width;
				}
				if (extraOpts.height){
					height= extraOpts.height;
				}
			}
	      
		    var svg = dimple.newSvg('#' + elementId, width, height);
	        var myChart = new dimple.chart(svg, dataset);
	        myChart.setBounds(50, 10, width-100, height-100);
	        myChart.addCategoryAxis("x", ["Price Tier", "Channel"]);
	        myChart.addMeasureAxis("y", "Unit Sales");
	        myChart.addSeries("Owner", dimple.plot.bar);
	        myChart.addLegend(200, 10, 380, 20, "right");
	        myChart.draw();
		}
	});
	
}) ( jQuery );