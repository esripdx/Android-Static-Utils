Android-Static-Utils
====================

Just some handy static classes/methods for dealing with common Android tasks.

### Package:
`com.esri.android.util`

### Static Classes:

* `NetUtils` - Static methods for getting/posting JSON, posting form-encoded data, opening and listening to UDP sockets.  Handles background threading on behalf of the user, while providing listeners/callbacks that will execute user-provided code on the main thread.  Also contains some helper methods for URL encoding, checking conenctivity status on the device and generating random Strings (as non-unique IDs for Http logs etc.).

* `SharedPrefsUtils` - Static methods for reading & writing to & from `SharedPreferences`. Methods are provided for each type that can be read/written, and just obfuscates some of the boiler-plate associated with `SharedPreferences`. Only uses __Default__ `SharedPreferences` at the current point in time.
