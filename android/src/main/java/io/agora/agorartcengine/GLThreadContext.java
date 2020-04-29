package io.agora.agorartcengine;

import android.opengl.EGLContext;

import io.agora.agorartcengine.gles.ProgramTextureOES;
import io.agora.agorartcengine.gles.core.EglCore;


public class GLThreadContext {
    public EglCore eglCore;
    public EGLContext context;
    public ProgramTextureOES program;
}
