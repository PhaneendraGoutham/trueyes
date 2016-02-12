angular.module('root', ['ui.bootstrap', 'ui.utils', 'ui.router', 'ngAnimate']);

angular.module('root').config(function($stateProvider) {

    $stateProvider
        .state('root', {
            abstract: true,
            resolve: {
                currentUser: function($http) {
                    return $http.get('/user').then(function(success) {
                        console.log(success);
                        return success;
                    }, function(error) {
                        console.log(error);
                        return {auth:0};
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
