angular.module('home', ['root']);

angular.module('home').config(function($stateProvider) {

    $stateProvider.state('home', {
        url: '/home',
        parent: 'root',
        views: {
            'mainContent': {
                template: 'This is main content',
                controller: function() {
                    console.log("this is home dashboard controller");
                }
            }
        }
    });
    /* Add New States Above */

});
