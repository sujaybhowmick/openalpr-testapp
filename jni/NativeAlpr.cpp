
#include "NativeAlpr.h"
#include <alpr.h>
#include <string.h>

JNIEXPORT jstring JNICALL Java_com_example_openalpr_NativeAlpr_stringFromJNI
  (JNIEnv *env, jobject thiz)
{
	std::string message = "Open Alpr Version:" + Alpr::getVersion();

	return env->NewStringUTF((message.c_str()));
}
