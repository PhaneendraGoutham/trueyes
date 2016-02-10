angular.module('customer', ['ui.bootstrap','ui.utils','ui.router','ngAnimate']);

angular.module('customer').config(function($stateProvider) {

    $stateProvider.state('list-customer', {
        url: '/customer/list',
        templateUrl: 'customer/partial/list-customer/list-customer.html'
    });
    $stateProvider.state('edit-customer', {
        url: '/customer/:id',
        templateUrl: 'customer/partial/edit-customer/edit-customer.html'
    });
    /* Add New States Above */

});

