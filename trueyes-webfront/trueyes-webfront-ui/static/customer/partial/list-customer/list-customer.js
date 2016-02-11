angular.module('customer').controller('ListCustomerCtrl', function($scope, customers) {
    $scope.customers = customers;
});
