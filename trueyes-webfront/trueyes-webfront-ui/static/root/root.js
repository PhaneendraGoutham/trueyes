angular.module('root', ['ui.bootstrap', 'ui.utils', 'ui.router', 'ngAnimate']);

angular.module('root').config(function($stateProvider) {

    $stateProvider
        .state('root', {
            abstract: true,
            resolve: {
                currentUser: function() {
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
