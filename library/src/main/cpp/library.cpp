// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("library");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("library")
//      }
//    }

#include <jni.h>

#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_arjun1194_crasher_Crasher_nativeCrash(JNIEnv* env, jobject /* this */) {
    raise(SIGSEGV);
    return nullptr;
}