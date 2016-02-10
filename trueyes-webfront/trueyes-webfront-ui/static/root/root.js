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
            controller: function($scope) {
                console.debug('root controller');
            },
            templateUrl: 'root/layout.html',
        });
    /* Add New States Above */

});
