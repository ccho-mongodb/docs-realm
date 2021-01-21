val user = app.currentUser()
user!!.apiKeys
    .fetchAll { result ->
        if (result.isSuccess) {
            Log.v("EXAMPLE", "Successfully fetched API keys: ${result.get().toTypedArray()}")
            expectation.fulfill()
        } else {
            Log.e("EXAMPLE", "Error fetching API keys: ${result.error}")
        }
    }