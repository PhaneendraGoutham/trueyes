angular.module('customer', ['ui.bootstrap', 'ui.utils', 'ui.router', 'ngAnimate']);

angular.module('customer').config(function($stateProvider) {

    $stateProvider.state('list-customer', {
        url: '/customer/list',
        parent: 'root',
        views: {
            'mainContent': {
                templateUrl: 'customer/partial/list-customer/list-customer.html',
                controller: 'ListCustomerCtrl'
            }
        },
        resolve: {
            customers: function(currentUser) {
                console.debug("Getting customer page");
                return [{
                    name: 'Sambhav'
                }];
            }
        }

    });
    $stateProvider.state('edit-customer', {
        url: '/customer/:id',
        parent: 'root',
        resolve: {
            customer: function(currentUser, $stateParams) {
                if ($stateParams.id) {
                    console.log('Will get customer with id: ' + $stateParams.id);
                } else {
                    return {};
                };
            }
        },
        params: {
            id: {
                value: "",
                squash: true
            }
        },
        views: {
            'mainContent': {
                templateUrl: 'customer/partial/edit-customer/edit-customer.html',
                controller: 'EditCustomerCtrl'
            }
        }

    });
    /* Add New States Above */

});
