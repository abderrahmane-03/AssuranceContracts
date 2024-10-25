<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Insurance Form</title>
  <script>
    function toggleInsuranceFields() {
      var insuranceType = document.getElementById("insuranceType").value;

      document.getElementById("homeFields").style.display = "none";
      document.getElementById("carFields").style.display = "none";
      document.getElementById("healthFields").style.display = "none";

      if (insuranceType === "Home Insurance") {
        document.getElementById("homeFields").style.display = "block";
      } else if (insuranceType === "Car Insurance") {
        document.getElementById("carFields").style.display = "block";
      } else if (insuranceType === "Health Insurance") {
        document.getElementById("healthFields").style.display = "block";
      }
    }
    function updateFormAction() {
      var selectedInsurance = document.getElementById("insuranceType").value;
      var form = document.getElementById("insuranceForm");
      if (selectedInsurance === "Home Insurance") {
        form.action = "${pageContext.request.contextPath}/insurances/RequestedHomeInsurance";
      } else if (selectedInsurance === "Car Insurance") {
        form.action = "${pageContext.request.contextPath}/insurances/RequestedCarInsurance";
       } else if (selectedInsurance === "Health Insurance") {
        form.action = "${pageContext.request.contextPath}/insurances/RequestedHealthInsurance";

      }
    }
  </script>
</head>
<body>
<form id="insuranceForm" method="post" onsubmit="updateFormAction()" action="">
  <div class="mb-4">
    <label class="block text-gray-700 text-sm font-bold mb-2">Insurance Type:</label>
    <select id="insuranceType" name="insuranceType" onchange="toggleInsuranceFields()"
            class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500">
      <option value="">Select Insurance Type</option>
      <option value="Home Insurance">Home Insurance</option>
      <option value="Car Insurance">Car Insurance</option>
      <option value="Health Insurance">Health Insurance</option>
    </select>
  </div>

  <!-- Common Fields -->
  <div class="mb-4">
    <label class="block text-gray-700 text-sm font-bold mb-2">Age:</label>
    <input type="text" name="age" required
           class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
  </div>

  <!-- Home Insurance Fields -->
  <div id="homeFields" style="display: none;">
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Asset Value:</label>
      <input type="text" name="assetValue"
             class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
    </div>
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Asset Type:</label>
      <input type="text" name="assetType"
             class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
    </div>
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Localization:</label>
      <input type="text" name="localization"
             class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
    </div>
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Security System:</label>
      <input type="text" name="securitySystem"
             class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
    </div>
  </div>

  <!-- Car Insurance Fields -->
  <div id="carFields" style="display: none;">
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Vehicle Type:</label>
      <input type="text" name="vehicleType"
             class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
    </div>
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Vehicle Using:</label>
      <input type="text" name="vehicleUsing"
             class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
    </div>
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Driver History:</label>
      <input type="text" name="driverHistory"
             class="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"/>
    </div>
  </div>

  <!-- Health Insurance Fields -->
  <div id="healthFields" style="display: none;">
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Type of Coverage:</label>
      <select name="typeCoverage" >
        <option value="Basic">Basic</option>
        <option value="Premium">Premium</option>
      </select>
       </div>
    <div class="mb-4">
      <label class="block text-gray-700 text-sm font-bold mb-2">Health Status:</label>
      <select name="healthStatus" >
        <option value="medicaux">Médicaux</option>
        <option value="antecedents">Antécédents</option>
      </select>
     </div>
  </div>

  <div class="text-center">
    <button type="submit"
            class="w-full bg-indigo-600 text-white py-2 px-4 rounded-lg hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-indigo-500">
      Submit
    </button>
  </div>
</form>
</body>
</html>
