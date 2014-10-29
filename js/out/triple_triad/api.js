// Compiled by ClojureScript 0.0-2173
goog.provide('triple_triad.api');
goog.require('cljs.core');
triple_triad.api.neighbours = (function neighbours(row,col){var iter__4158__auto__ = (function iter__4799(s__4800){return (new cljs.core.LazySeq(null,(function (){var s__4800__$1 = s__4800;while(true){
var temp__4092__auto__ = cljs.core.seq.call(null,s__4800__$1);if(temp__4092__auto__)
{var s__4800__$2 = temp__4092__auto__;if(cljs.core.chunked_seq_QMARK_.call(null,s__4800__$2))
{var c__4156__auto__ = cljs.core.chunk_first.call(null,s__4800__$2);var size__4157__auto__ = cljs.core.count.call(null,c__4156__auto__);var b__4802 = cljs.core.chunk_buffer.call(null,size__4157__auto__);if((function (){var i__4801 = 0;while(true){
if((i__4801 < size__4157__auto__))
{var vec__4805 = cljs.core._nth.call(null,c__4156__auto__,i__4801);var r = cljs.core.nth.call(null,vec__4805,0,null);var c = cljs.core.nth.call(null,vec__4805,1,null);var neighbour = vec__4805;if((((0 <= r)) && ((r <= 2))) && (((0 <= c)) && ((c <= 2))))
{cljs.core.chunk_append.call(null,b__4802,neighbour);
{
var G__4807 = (i__4801 + 1);
i__4801 = G__4807;
continue;
}
} else
{{
var G__4808 = (i__4801 + 1);
i__4801 = G__4808;
continue;
}
}
} else
{return true;
}
break;
}
})())
{return cljs.core.chunk_cons.call(null,cljs.core.chunk.call(null,b__4802),iter__4799.call(null,cljs.core.chunk_rest.call(null,s__4800__$2)));
} else
{return cljs.core.chunk_cons.call(null,cljs.core.chunk.call(null,b__4802),null);
}
} else
{var vec__4806 = cljs.core.first.call(null,s__4800__$2);var r = cljs.core.nth.call(null,vec__4806,0,null);var c = cljs.core.nth.call(null,vec__4806,1,null);var neighbour = vec__4806;if((((0 <= r)) && ((r <= 2))) && (((0 <= c)) && ((c <= 2))))
{return cljs.core.cons.call(null,neighbour,iter__4799.call(null,cljs.core.rest.call(null,s__4800__$2)));
} else
{{
var G__4809 = cljs.core.rest.call(null,s__4800__$2);
s__4800__$1 = G__4809;
continue;
}
}
}
} else
{return null;
}
break;
}
}),null,null));
});return iter__4158__auto__.call(null,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [(row - 1),col,new cljs.core.Keyword(null,"top","top",1014019271),new cljs.core.Keyword(null,"bottom","bottom",3925642653)], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [(row + 1),col,new cljs.core.Keyword(null,"bottom","bottom",3925642653),new cljs.core.Keyword(null,"top","top",1014019271)], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [row,(col - 1),new cljs.core.Keyword(null,"left","left",1017222009),new cljs.core.Keyword(null,"right","right",1122416014)], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [row,(col + 1),new cljs.core.Keyword(null,"right","right",1122416014),new cljs.core.Keyword(null,"left","left",1017222009)], null)], null));
});
/**
* Returns the next grid state with the new card added
*/
triple_triad.api.grid_step = (function grid_step(cards,grid,row,col,p__4810){var vec__4815 = p__4810;var player = cljs.core.nth.call(null,vec__4815,0,null);var picked = cljs.core.nth.call(null,vec__4815,1,null);var attacker = cards.call(null,picked);return cljs.core.reduce.call(null,(function (g,p__4816){var vec__4817 = p__4816;var r = cljs.core.nth.call(null,vec__4817,0,null);var c = cljs.core.nth.call(null,vec__4817,1,null);var atk = cljs.core.nth.call(null,vec__4817,2,null);var blk = cljs.core.nth.call(null,vec__4817,3,null);var vec__4818 = cljs.core.get_in.call(null,grid,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [r,c], null));var color = cljs.core.nth.call(null,vec__4818,0,null);var idx = cljs.core.nth.call(null,vec__4818,1,null);var blocker = (function (){var and__3429__auto__ = idx;if(cljs.core.truth_(and__3429__auto__))
{return cards.call(null,idx);
} else
{return and__3429__auto__;
}
})();if(cljs.core.truth_((function (){var and__3429__auto__ = blocker;if(cljs.core.truth_(and__3429__auto__))
{return (cljs.core.not_EQ_.call(null,color,player)) && ((blocker.call(null,blk) < attacker.call(null,atk)));
} else
{return and__3429__auto__;
}
})()))
{return cljs.core.assoc_in.call(null,g,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [r,c], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [player,idx], null));
} else
{return g;
}
}),cljs.core.assoc_in.call(null,grid,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [row,col], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [player,picked], null)),triple_triad.api.neighbours.call(null,row,col));
});
/**
* Returns winnner if any, o/w returns nil
*/
triple_triad.api.winner = (function winner(grid){var values = cljs.core.apply.call(null,cljs.core.concat,grid);if(cljs.core.not_any_QMARK_.call(null,cljs.core.nil_QMARK_,values))
{return cljs.core.first.call(null,cljs.core.last.call(null,cljs.core.sort_by.call(null,cljs.core.second,cljs.core.frequencies.call(null,cljs.core.map.call(null,cljs.core.first,values)))));
} else
{return null;
}
});

//# sourceMappingURL=api.js.map