// automatically generated by the FlatBuffers compiler, do not modify

package nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FlatGraph extends Table {
  public static FlatGraph getRootAsFlatGraph(ByteBuffer _bb) { return getRootAsFlatGraph(_bb, new FlatGraph()); }
  public static FlatGraph getRootAsFlatGraph(ByteBuffer _bb, FlatGraph obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FlatGraph __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public nd4j.graph.FlatNode nodes(int j) { return nodes(new nd4j.graph.FlatNode(), j); }
  public nd4j.graph.FlatNode nodes(nd4j.graph.FlatNode obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int nodesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }

  public static int createFlatGraph(FlatBufferBuilder builder,
      int id,
      int nodesOffset) {
    builder.startObject(2);
    FlatGraph.addNodes(builder, nodesOffset);
    FlatGraph.addId(builder, id);
    return FlatGraph.endFlatGraph(builder);
  }

  public static void startFlatGraph(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addNodes(FlatBufferBuilder builder, int nodesOffset) { builder.addOffset(1, nodesOffset, 0); }
  public static int createNodesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startNodesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFlatGraph(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishFlatGraphBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}

