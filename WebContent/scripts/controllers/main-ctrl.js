(function() {
	'use strict';
	
	var restApp = angular.module('restApp', []);
	
	restApp.controller('MainCtrl', MainController)
	
	MainController.$inject = ['$http'];
	function MainController($http) {
		var mctrl = this;
		
		mctrl.getAll = function() {
			$http({
			 method:'GET',
			 url: 'api/employee/all'
			}).success(function(data){
				mctrl.name = data;
			}).error(function(data) {
				console.log(error);
				
			});
			
		};
	}
	
	
})();