angular.module('crmModule', ['rootModule']);

angular.module('crmModule').config(function($stateProvider) {

    $stateProvider.state('list-customer', {
    	parent:'root',
        url: '/customer/list',
        resolve : {
        	customers : function(currentUser,$http){
        		return $http.get('customer/list').then(function(success){
        			return success;
        		},function(error){
        			console.warn('Error while fetching customers');
        			return null;
        		});
        	}
        },
        views : {
        	'mainContent' : {
        		templateUrl: 'crm-module/partial/list-customer/list-customer.html',
        		controller:'ListCustomerCtrl'
        	}
        }
        
    });
    /* Add New States Above */

});

