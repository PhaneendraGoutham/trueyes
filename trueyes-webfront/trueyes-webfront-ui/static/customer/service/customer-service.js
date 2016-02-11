angular.module('customer').factory('customerService', function($http) {


    return {
        list: function() {
            return $http.get('customer-resource/list');
        }
    };
});
