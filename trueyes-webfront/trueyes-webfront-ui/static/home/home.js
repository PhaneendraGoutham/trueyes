angular.module('home', ['root']);

angular.module('home').config(function($stateProvider) {

    $stateProvider.state('home', {
        url: '/home',
        parent: 'root',
        views: {
            'mainContent': {
                templateUrl: '/home/partial/home/home.html',
                controller: 'HomeCtrl'
            }
        }
    });
    /* Add New States Above */

});
