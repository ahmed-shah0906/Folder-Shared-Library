String getSubscriptionName(String environment) {
   assert environment: 'environment is required'
   if (environment.equalsIgnoreCase('QA') || environment.equalsIgnoreCase('RC')
      || environment.equalsIgnoreCase('Performance')
      || environment.equalsIgnoreCase('Integration')) {
      return 'Azure-SP-Test'
   } else if (environment.equalsIgnoreCase('PROD')) {
      return 'Azure-SP-Prod'
   }
   return 'Azure-SP-Dev'
}