package org.jetbrains.skiko

import org.jetbrains.skia.Canvas
import org.jetbrains.skia.PixelGeometry

actual open class SkiaLayer  {
    actual var renderApi: GraphicsApi
        get() = TODO("Not yet implemented")
        set(value) {}
    actual val contentScale: Float
        get() = TODO("Not yet implemented")
    actual var fullscreen: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var transparency: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    actual val component: Any?
        get() = TODO("Not yet implemented")
    actual fun needRedraw() {
        TODO("unimplemented")
    }
    actual fun attachTo(container: Any) {
        TODO("unimplemented")
    }
    actual fun detach() {
        TODO("unimplemented")
    }

    internal actual fun draw(canvas: Canvas) {
        TODO("unimplemented")
    }

    actual var skikoView: SkikoView? = null
    actual val pixelGeometry: PixelGeometry
        get() = TODO("Not yet implemented")
}

// TODO: do properly
actual typealias SkikoTouchPlatformEvent = Any
actual typealias SkikoGesturePlatformEvent = Any
actual typealias SkikoPlatformInputEvent = Any
actual typealias SkikoPlatformKeyboardEvent = Any
actual typealias SkikoPlatformPointerEvent = Any

actual val currentSystemTheme: SystemTheme
    get() = SystemTheme.UNKNOWN