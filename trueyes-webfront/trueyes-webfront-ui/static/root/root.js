angular.module('root', ['ui.bootstrap', 'ui.utils', 'ui.router', 'ngAnimate']);

angular.module('root').config(function($stateProvider) {

    $stateProvider
        .state('root', {
            abstract: true,
            resolve: {
                currentUser: function($http,$location) {
                	return $http.get('user').then(function(success){
                		console.debug('User Logged in');
                		return success.data;
                	},function(error){
                		console.warn('user not logged in');
                		return null;
                	});
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
