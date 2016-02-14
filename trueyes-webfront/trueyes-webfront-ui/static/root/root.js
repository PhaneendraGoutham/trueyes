angular.module('root', ['ui.bootstrap', 'ui.utils', 'ui.router', 'ngAnimate']);

angular.module('root').config(function($stateProvider) {

    $stateProvider
        .state('root', {
            abstract: true,
            resolve: {
                currentUser: function($http) {

                	$http.get('user').then(function(success){
                		alert('Eureka user call');
                		console.info(success);
                	},function(error){
                		alert('user call failed');
                		console.error(error);
                	});
                	
                	$http.get('resource/list').success(function(data) {
                		alert('REsource call works');
                		console.log(data);
                	}).error(function(error){
                		alert('Resource Call Failed');
                		console.error(error);
                	});

                    return {
                        name: 'Sambhav'
                    };
                }
            },
            controller: function($scope, currentUser) {
                console.debug('root controller');
                console.debug(currentUser);
            },
            templateUrl: 'root/layout.html',
        });
    /* Add New States Above */

});
